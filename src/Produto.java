import java.time.LocalDateTime;

/*
    id: long
    *titulo: String
    descricao: String
    marca: String
    modelo: String
    estoque: int (valor padrão zero)
    *preco: double (deve ser maior que zero)
    *dataCadastro: LocalDate (não pode ser menor que a data atual)
    *dataUltimaAtualizacao: LocalDate (não pode ser menor que a data atual)
    urlFoto: String
    *categoria: String
    peso: double
    altura: double
    largura: double
    profundidade: double


* */
public class Produto {
    long id;
    int estoque=0;
    String titulo, descricao, marca, modelo, urlFoto, categoria;
    LocalDateTime dataCadastro, dataUltimaAtualizacao;
    double peso, altura, largura, profundidade;



}
