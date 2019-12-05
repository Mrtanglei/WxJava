package cn.binarywang.wx.miniapp.bean.template;

import java.io.Serializable;

import lombok.Data;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

@Data
public class SubscribeTemplateAddResult implements Serializable {

  private static final long serialVersionUID = 8167823792140380575L;

  private String priTmplId;

  public static SubscribeTemplateAddResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, SubscribeTemplateAddResult.class);
  }
}
