package FlatMapStreams;

import domain.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdTeste2 {
    static void main(String[] args) {
        List<Produto> p1 = new ArrayList<>();
        p1.add(new Produto("arroz", 25));
        p1.add(new Produto("feijao", 40));
        p1.add(new Produto("macarrao", 10));

        p1.stream().map(s -> s.getNome()).forEach(s -> System.out.println(s));
        System.out.println("_------------------");
        List<List<Produto>> prod = List.of(
                List.of(new Produto("arroz", 10), new Produto("carne", 45)),
                List.of(new Produto("feijap", 40) , new Produto("abobora", 10)),
                List.of(new Produto("macarrao" ,40) , new Produto("macaxeira",20))
        );
        prod.stream().map(l -> l.stream().map(s -> s.getNome())); 
       prod.stream().flatMap(s-> s.stream().map(d ->d.getNome())).forEach(s -> System.out.println(s));
    }

}
