package DIP.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private MySqlConnection mySqlConnection;

    public ProdutoRepository (MySqlConnection mySqlConnection){
        this.mySqlConnection = mySqlConnection;
    }

    public List<Produto> buscarProdutos(){
        //retorna uma lista de produtos
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto){
        //salva lista de produtos na base de dados
    }
}
