package SRP.problem;

import SRP.solution.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

    private List<SRP.solution.Produto> produtos = new ArrayList<>();

    public void adicionarProduto( ){
        //código para adicionar um produto
    }

    public void removerProduto( ){
        //código para remover um produto
    }

    public BigDecimal calcularTotal(){
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<OrdemDeCompra> buscarOrdemDeCompra(){
        //retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdemCompra(){
        //salva a ordem de compra
    }

    public void enviarEmail(){
        //enviar email da ordem de compra
    }

    public void imprimirOrdemDeCompra(){
        //imprimir ordem de compra
    }
}
