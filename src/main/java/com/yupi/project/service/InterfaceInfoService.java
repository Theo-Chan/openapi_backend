package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.InterfaceInfo;
import com.yupi.project.model.entity.Post;

/**
* @author adbam
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-24 16:26:14
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo wq
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
