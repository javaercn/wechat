/*
 * Copyright (c) 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.javaer.wechat.sdk.mp.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信公众号基本的响应信息.
 *
 * @author zhangpeng
 */
@Getter
@Setter
@ToString
public abstract class WeChatMpResponse {
    @JsonProperty("errcode")
    protected String errCode;

    @JsonProperty("errmsg")
    protected String errMsg;

    @Setter(AccessLevel.PRIVATE)
    protected Map<String, String> otherProperties = new HashMap<>();

    @JsonAnySetter
    protected void setOtherProperties(final String name, final String value) {
        this.otherProperties.put(name, value);
    }

    public boolean isSuccessful() {
        return null == this.errCode || this.errCode.isEmpty() || "0".equals(this.errCode);
    }
}
