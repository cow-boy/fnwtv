package com.tv.dao;

import com.tv.model.LiveTv;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by HUXU on 2017/10/29.
 */
public interface LiveTvDao {

    /**
     * 电视直播源查询
     * @param liveType
     * @param isHot
     * @return
     */
    List<LiveTv> selLiveTvList(@Param("liveType") Short liveType, @Param("isHot") Short isHot);

}
