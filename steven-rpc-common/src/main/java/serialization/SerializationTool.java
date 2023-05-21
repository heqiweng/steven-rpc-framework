package serialization;

import annotation.RpcSerializationSelector;
import configuration.GlobalConfiguration;
import exception.RpcException;
import lombok.extern.slf4j.Slf4j;
import serialization.protostuff.ProtostuffUtils;

//这是一个进行统一序列化的一个工具

/**
 * @author steven
 */
@Slf4j
public class SerializationTool implements Serializer {

    static String serialization = GlobalConfiguration.class.getAnnotation(RpcSerializationSelector.class).RpcSerialization();

    @Override
    public byte[] serialize(Object obj) {
        log.info("序列化方法："+serialization);
        switch (serialization) {
            case "protostuff":
                return new ProtostuffUtils().serialize(obj);
            default:
                try {
                    throw new RpcException("你所找的序列化方法还没编写，或者可能在该版本被废弃了，你可以看看2.2版本");
                } catch (RpcException e) {
                    log.error(e.getMessage(), e);
                    return new byte[0];
                }
        }
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) {
        switch (serialization) {
            case "protostuff":
                return new ProtostuffUtils().deserialize(bytes, clazz);
            default:
                try {
                    throw new RpcException("你所找的序列化方法还没编写，或者可能在该版本被废弃了，你可以看看2.2版本");
                } catch (RpcException e) {
                    log.error(e.getMessage(), e);
                    return null;
                }
        }
    }
}
