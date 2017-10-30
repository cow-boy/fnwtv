package com.tv.service;/**
 * Created by HUXU on 2017/10/30.
 */

import com.tv.provider.LiveTvProvider;
import org.springframework.data.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 视频直播实现
 *
 * @author huxu
 * @create 2017-10-30 16:34
 **/
@Service
public class LiveTvImpl {

    @Reference
    public LiveTvProvider liveTvProvider;

    public Object selLiveTvList(short liveType, short isHot) {

        Object o = liveTvProvider.selLiveTvList(liveType, isHot);

        return o;
    }
}
