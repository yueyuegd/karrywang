package info.karrywang.mapper;

import info.karrywang.domain.KWUserInfo;
import info.karrywang.domain.KWUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KWUserInfoMapper {
    int countByExample(KWUserInfoExample example);

    int insert(KWUserInfo record);

    int insertSelective(KWUserInfo record);

    List<KWUserInfo> selectByExample(KWUserInfoExample example);

    KWUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KWUserInfo record, @Param("example") KWUserInfoExample example);

    int updateByExample(@Param("record") KWUserInfo record, @Param("example") KWUserInfoExample example);

    int updateByPrimaryKeySelective(KWUserInfo record);

    int updateByPrimaryKey(KWUserInfo record);
}