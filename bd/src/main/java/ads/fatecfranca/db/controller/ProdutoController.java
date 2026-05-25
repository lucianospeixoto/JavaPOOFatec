package ads.fatecfranca.db.controller;


import ads.fatecfranca.db.model.Produto;
import ads.fatecfranca.db.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private  ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(produtoService.listar());
    }


    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Produto> remover(@PathVariable Long id){
     if (produtoService.remover(id)){
         return ResponseEntity.ok().build();
     }
     return ResponseEntity.notFound().build();
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto> adicionar(@RequestBody Produto produto) {
        produtoService.criar(produto);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/produtos/{id}")
    public  ResponseEntity <Produto>atualizar(@PathVariable Long id, @RequestBody Produto produto){
        Produto produtoAtualizado = produtoService.atualizar(id, produto);
        if (produtoAtualizado != null){
            return ResponseEntity.ok(produtoAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

}


