package heartbeat;

import annotation.HeartBeatTool;

/**
 * @author steven
 */
@Deprecated
@HeartBeatTool(isOpenFunction = true,   //是否开启的标志
        readerIdleTimeSeconds = 4,      //超过多长时间触发读空闲事件
        writerIdleTimeSeconds = 4,      //超过多长时间触发写空闲事件
        allIdleTimeSeconds = 2)         //超过多长事件触发读写空闲事件
public interface HeartBeat {
}
