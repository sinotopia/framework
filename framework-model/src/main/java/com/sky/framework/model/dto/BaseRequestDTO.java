/*
 * The MIT License (MIT)
 * Copyright © 2019-2020 <sky>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.sky.framework.model.dto;

import lombok.Data;

/**
 * 请求实体基础类
 * @author
 */
@SuppressWarnings("serial")
@Data
public class BaseRequestDTO extends BaseDTO {

    /**
     * 版本号
     */
    private String version;
    /**
     * 应用系统编码
     */
    private String appCode;
    /**
     * 平台编码
     */
    private String sourceCode;
    /**
     * 字符集
     */
    private String charset;
    /**
     * 扩展字段
     */
    private String extParam;
    /**
     * 唯一ID 用于验证幂等性
      */
    private String uniqueId;

    /**
     * access_token  访问token
     */
    private String accessToken;

    /**
     * refresh_token  刷新token
     */
    private String refreshToken;

    /**
     * client_id
     */
    private String clientId;

    /**
     * secret_key
     */
    private String secretKey;
}
