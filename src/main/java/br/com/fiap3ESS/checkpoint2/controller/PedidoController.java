package br.com.fiap3ESS.checkpoint2.controller;

import br.com.fiap3ESS.checkpoint2.model.Pedido;
import br.com.fiap3ESS.checkpoint2.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return pedidoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    @PostMapping
    public Pedido criar(@Valid @RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizar(@PathVariable Long id, @Valid @RequestBody Pedido pedidoAtualizado) {
        Pedido pedidoExistente = pedidoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        pedidoExistente.setClienteNome(pedidoAtualizado.getClienteNome());
        pedidoExistente.setValorTotal(pedidoAtualizado.getValorTotal());

        return pedidoService.salvar(pedidoExistente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pedidoService.deletar(id);
    }
}
