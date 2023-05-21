package compress;

//实现压缩的接口

/**
 * @author steven
 */
public interface CompressType {
    //压缩方法
    byte[] compress(byte[] bytes);

    //解压方法
    byte[] deCompress(byte[] bytes);
}
