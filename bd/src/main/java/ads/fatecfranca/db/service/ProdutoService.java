package ads.fatecfranca.db.service;

import ads.fatecfranca.db.model.Produto;
import ads.fatecfranca.db.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;


    // injeção de dependencia pelo construtor
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public boolean remover(Long id){
        if (produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
        }
        return true;
    }

    public Produto criar(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    public Produto atualizar(Long id, Produto produto){
        if(produtoRepository.existsById(id)){
            produto.setId(id); // coloca id no produto
            produtoRepository.save(produto); //atualiza
            return produto;
        }
        return null;
    }
}
