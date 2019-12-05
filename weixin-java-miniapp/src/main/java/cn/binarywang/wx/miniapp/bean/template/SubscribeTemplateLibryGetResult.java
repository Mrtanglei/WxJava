package cn.binarywang.wx.miniapp.bean.template;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

@Data
public class SubscribeTemplateLibryGetResult implements Serializable {

  private static final long serialVersionUID = -803951102696948246L;

  private List<KeywordInfo> data;

  @Data
  public static class KeywordInfo {
    private int kid;

    private String name;

    private String example;

    private String rule;
  }

  public static SubscribeTemplateLibryGetResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, SubscribeTemplateLibryGetResult.class);
  }
}
