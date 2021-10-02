package work.yk0.jdk17suburi.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * author ykonno
 * since 2021/10/03
 */
@Mapper
public interface SuburiRepository {

    @Select("")
    public 出店 find出店(Integer 出店id)
}
