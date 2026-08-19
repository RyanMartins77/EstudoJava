package domain;

import java.util.List;
import java.util.stream.Stream;

public class BibTestte {
    static void main(String[] args) {
        List<List<Livro>> grupos = List.of(
                List.of(
                        new Livro("Java Básico", 30),
                        new Livro("Java Streams", 50)
                ),
                List.of(
                        new Livro("Python", 25),
                        new Livro("SQL", 60)
                ),
                List.of(
                        new Livro("Git", 20),
                        new Livro("Java Avançado", 80)
                )
        );
        Stream<Livro> livroStream = grupos.stream().flatMap(l -> l.stream());
        grupos.stream().flatMap(l -> l.stream().map(Livro::getNome)).forEach(s -> System.out.println(s));
    }
}
