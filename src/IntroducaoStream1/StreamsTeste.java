package IntroducaoStream1;

import domain.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTeste {
    static void main(String[] args) {
        List<LigthNovel> ligthNovels = new ArrayList<>(List.of(new LigthNovel("goku", 4.99),
                new LigthNovel("naruto", 6.99),
                new LigthNovel("Overload", 5.99),
                new LigthNovel("No game No Life", 7.99)));
        List<String> collect = ligthNovels.stream()
                .sorted(Comparator.comparing(LigthNovel::getPrince))
                .filter(p -> p.getPrince() > 5)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
    }

