package register;

import annotation.RegistryChosen;

//注册中心的选择在这配置
/*
    zookeeper   zk注册中心
    zkCurator   Curator协助操作注册中心
*/

/**
 * @author steven
 * 注册中心的配置类  过时了
 */
@Deprecated
@RegistryChosen(registryName = "zookeeper")
public interface Register {
}
