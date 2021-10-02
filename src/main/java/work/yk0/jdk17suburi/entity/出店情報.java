package work.yk0.jdk17suburi.entity;

/**
 * author ykonno
 * since 2021/10/03
 */
public class 出店情報 {

    String 出店名;

    String 出店id;

    Integer チケット価格;

    public String get店舗種別() {
        return 店舗種別;
    }

    public void set店舗種別(String 店舗種別) {
        this.店舗種別 = 店舗種別;
    }

    String 店舗種別;

    public String get出店名() {
        return 出店名;
    }

    public void set出店名(String 出店名) {
        this.出店名 = 出店名;
    }

    public String get出店id() {
        return 出店id;
    }

    public void set出店id(String 出店id) {
        this.出店id = 出店id;
    }

    public Integer getチケット価格() {
        return チケット価格;
    }

    public void setチケット価格(Integer チケット価格) {
        this.チケット価格 = チケット価格;
    }
}
