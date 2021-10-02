package work.yk0.jdk17suburi.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.yk0.jdk17suburi.entity.出店情報;
import work.yk0.jdk17suburi.repository.SuburiRepository;

import java.util.List;

/**
 * author ykonno
 * since 2021/10/03
 */
@RestController
public class SuburiController {

    @Autowired
    SuburiRepository suburiRepository;

    @GetMapping("find")
    public 出店情報 find(FindParam param){
        System.out.println("出店id : " + param.id());

        var findResult = suburiRepository.find出店(param.id());

        findResult.set店舗種別(
                switch (findResult.getチケット価格()){
                    case 0  -> "無料";
                    default -> "有料";
                }
        );

        var stringList = List.of("a", "お", "わ", "2", "り");
        stringList.stream()
                .filter(str -> str.getBytes().length > 2)
                .forEach(System.out::println);

        return findResult;
    }

}
