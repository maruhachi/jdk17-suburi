package work.yk0.jdk17suburi.util;

import work.yk0.jdk17suburi.app.FindParam;

/**
 * author ykonno
 * since 2021/10/03
 */
public class SugoiFukaiUtil {

    public Boolean NulPoUtil(FindParam param){
        あれこれするメソッド(param);
        return true;
    }

    private Boolean あれこれするメソッド(FindParam p){
        if(inClass.areyaKoreya(p.id()).toString().length() > 0) {

            return true;
        } else{
            return false;
        }
    }

    class inClass {

        static String areyaKoreya(String id){
            System.out.println(id.length());
            return null;
        }

    }
}
