package com.tv.dao;

import com.api.model.LiveLine;
import com.api.model.LiveTv;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by HUXU on 2017/10/29.
 * @author huxu
 */
@Repository
public interface LiveTvDao {

    /**
     * 电视直播源查询
     * @param liveType
     * @param isHot
     * @return
     */
    List<LiveTv> selLiveTvList(@Param("liveType") Short liveType, @Param("isHot") Short isHot);

    List<LiveLine> selLiveLine(@Param("id") Integer id);
}
