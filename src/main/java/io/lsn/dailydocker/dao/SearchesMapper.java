package io.lsn.dailydocker.dao;

import io.lsn.dailydocker.dictionary.SearchParameter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SearchesMapper {

    @Insert("insert into searches(searchType,beginning,end,searchDate)" +
            "values(#{searchType},#{beginning},#{end},#{searchDate})")
    void saveSearchParameter(SearchParameter parameter);

    @Select("select * from searches")
    List<SearchParameter> getSearchParameterList();

    @Delete("truncate table searches")
    void truncateSearchesTable();

}
