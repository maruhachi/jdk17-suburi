package work.yk0.jdk17suburi.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import work.yk0.jdk17suburi.entity.出店情報;

/**
 * author ykonno
 * since 2021/10/03
 */
@Mapper
public interface SuburiRepository {

    // まだrecordはだめみたい https://github.com/mybatis/mybatis-3/issues/2195

    // TODO テキストブロック
    @Select("""
            Select 出店id, 出店名, チケット価格
            From 出店情報
            Where 出店id = #{出店id}
            """)
    public 出店情報 find出店(String 出店id);
}
