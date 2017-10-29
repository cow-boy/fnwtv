package com.tv.service;/**
 * Created by HUXU on 2017/10/29.
 */

import com.tv.dao.LiveTvDao;
import com.tv.model.LiveTv;
import com.tv.provider.LiveTvProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 电视视频直播
 *
 * @author huxu
 * @create 2017-10-29 17:36
 **/
@Service
public class LiveTvProviderImpl implements LiveTvProvider {

    @Autowired
    private LiveTvDao liveTvDao;

    @Override
    public String selLiveTvList(Short liveType, Short isHot) {

        List<LiveTv> ltv = liveTvDao.selLiveTvList(liveType, isHot);
        System.out.println(ltv);
        return null;
    }

}
