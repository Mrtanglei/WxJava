package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.template.*;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

public interface WxMaTemplateService {
  /**
   * 获取小程序模板库标题列表.
   */
  String TEMPLATE_LIBRARY_LIST_URL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/library/list";

  /**
   * 获取模板库某个模板标题下关键词库.
   */
  String TEMPLATE_LIBRARY_KEYWORD_URL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/library/get";

  /**
   * 组合模板并添加至帐号下的个人模板库.
   */
  String TEMPLATE_ADD_URL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/add";

  /**
   * 获取帐号下已存在的模板列表.
   */
  String TEMPLATE_LIST_URL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/list";

  /**
   * 删除帐号下的某个模板.
   */
  String TEMPLATE_DEL_URL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/del";

  String SUBSCRIBE_ADD_TEMPLATE = "https://api.weixin.qq.com/wxaapi/newtmpl/addtemplate";

  String SUBSCRIBE_TEMPLATE_KEY_WORDS_BY_ID = "https://api.weixin.qq.com/wxaapi/newtmpl/getpubtemplatekeywords";

  /**
   * <pre>
   * 获取小程序模板库标题列表
   *
   * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1500465446_j4CgR&token=&lang=zh_CN">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/cgi-bin/wxopen/template/library/list?access_token=ACCESS_TOKEN
   * </pre>
   */
  WxMaTemplateLibraryListResult findTemplateLibraryList(int offset, int count) throws WxErrorException;

  /**
   * <pre>
   * 获取模板库某个模板标题下关键词库
   *
   * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1500465446_j4CgR&token=&lang=zh_CN">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/cgi-bin/wxopen/template/library/get?access_token=ACCESS_TOKEN
   * </pre>
   */
  WxMaTemplateLibraryGetResult findTemplateLibraryKeywordList(String id) throws WxErrorException;

  /**
   * <pre>
   * 组合模板并添加至帐号下的个人模板库
   *
   * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1500465446_j4CgR&token=&lang=zh_CN">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/cgi-bin/wxopen/template/add?access_token=ACCESS_TOKEN
   * </pre>
   */
  WxMaTemplateAddResult addTemplate(String id, List<Integer> keywordIdList) throws WxErrorException;

  /**
   * <pre>
   * 获取帐号下已存在的模板列表
   *
   * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1500465446_j4CgR&token=&lang=zh_CN">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/cgi-bin/wxopen/template/list?access_token=ACCESS_TOKEN
   * </pre>
   */
  WxMaTemplateListResult findTemplateList(int offset, int count) throws WxErrorException;

  /**
   * <pre>
   * 删除帐号下的某个模板
   *
   * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1500465446_j4CgR&token=&lang=zh_CN">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/cgi-bin/wxopen/template/list?access_token=ACCESS_TOKEN
   * </pre>
   */
  boolean delTemplate(String templateId) throws WxErrorException;

  /**
   * <pre>
   * 获取订阅消息模板库某个模板标题下关键词库
   *
   * 详情请见: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getPubTemplateKeyWordsById.html>获取模板标题下的关键词列表</a>
   * 接口url格式: https://api.weixin.qq.com/wxaapi/newtmpl/getpubtemplatekeywords?access_token=ACCESS_TOKEN
   * </pre>
   */
  SubscribeTemplateLibryGetResult findPubTemplateKeyWordsById(String tid) throws WxErrorException;

  /**
   * <pre>
   * 订阅消息组合模板并添加至帐号下的个人模板库
   *
   * 详情请见: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.addTemplate.html">获取小程序模板库标题列表</a>
   * 接口url格式: https://api.weixin.qq.com/wxaapi/newtmpl/addtemplate?access_token=ACCESS_TOKEN
   * </pre>
   */
  SubscribeTemplateAddResult addSubscribeTemplate(String tid, List<Integer> keywordIdList,String sceneDesc) throws WxErrorException;
}
