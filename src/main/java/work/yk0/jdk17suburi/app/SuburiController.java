package work.yk0.jdk17suburi.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.yk0.jdk17suburi.entity.出店;
import work.yk0.jdk17suburi.repository.SuburiRepository;

/**
 * author ykonno
 * since 2021/10/03
 */
@RestController
public class SuburiController {

    @Autowired
    SuburiRepository suburiRepository;

    @GetMapping("find")
    public 出店 find(FindParam param){
        System.out.println("出店id : " + param.id());

        var findResult = suburiRepository.find出店(param.id());

        findResult.set店舗種別(
                switch (findResult.getチケット価格()){
                    case 0  -> "無料";
                    default -> "有料";
                }
        );

        return findResult;
    }

}
