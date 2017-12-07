package cn.javaer.wechat.sdk.pay

import cn.javaer.wechat.sdk.pay.model.WeChatPayNotifyResult
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * @author zhangpeng
 */
class WeChatPayNotifyResultTest extends Specification {
    def "testParser"() {
        when:
        JAXBContext context = JAXBContext.newInstance(WeChatPayNotifyResult)
        def unmarshaller = context.createUnmarshaller()
        StringReader reader = new StringReader("""
<xml>
    <appid><![CDATA[wx2421b1c4370ec43b]]></appid>
    <attach><![CDATA[支付测试]]></attach>
    <bank_type><![CDATA[CFT]]></bank_type>
    <fee_type><![CDATA[CNY]]></fee_type>
    <is_subscribe><![CDATA[Y]]></is_subscribe>
    <mch_id><![CDATA[10000100]]></mch_id>
    <nonce_str><![CDATA[5d2b6c2a8db53831f7eda20af46e531c]]></nonce_str>
    <openid><![CDATA[oUpF8uMEb4qRXf22hE3X68TekukE]]></openid>
    <out_trade_no><![CDATA[1409811653]]></out_trade_no>
    <result_code><![CDATA[SUCCESS]]></result_code>
    <return_code><![CDATA[SUCCESS]]></return_code>
    <sign><![CDATA[B552ED6B279343CB493C5DD0D78AB241]]></sign>
    <sub_mch_id><![CDATA[10000100]]></sub_mch_id>
    <time_end><![CDATA[20140903131540]]></time_end>
    <total_fee>1</total_fee>
    <coupon_fee><![CDATA[10]]></coupon_fee>
    <coupon_count><![CDATA[1]]></coupon_count>
    <coupon_type><![CDATA[CASH]]></coupon_type>
    <coupon_id><![CDATA[10000]]></coupon_id>
    <coupon_fee><![CDATA[100]]></coupon_fee>
    <trade_type><![CDATA[JSAPI]]></trade_type>
    <transaction_id><![CDATA[1004400740201409030005092168]]></transaction_id>

    <coupon_type_0>coupon_type_0</coupon_type_0>
    <coupon_id_0>coupon_id_0</coupon_id_0>
    <coupon_fee_0>0</coupon_fee_0>

    <coupon_type_1>coupon_type_1</coupon_type_1>
    <coupon_id_1>coupon_id_1</coupon_id_1>
    <coupon_fee_1>1</coupon_fee_1>

    <coupon_type_2>coupon_type_2</coupon_type_2>
    <coupon_id_2>coupon_id_2</coupon_id_2>
    <coupon_fee_2>2</coupon_fee_2>

    <coupon_type_3>coupon_type_3</coupon_type_3>
    <coupon_id_3>coupon_id_3</coupon_id_3>
    <coupon_fee_3>3</coupon_fee_3>

    <coupon_type_4>coupon_type_4</coupon_type_4>
    <coupon_id_4>coupon_id_4</coupon_id_4>
    <coupon_fee_4>4</coupon_fee_4>
</xml>
""")

        def weChatPayNotifyResult = (WeChatPayNotifyResult) unmarshaller.unmarshal(reader)
        println(weChatPayNotifyResult)
        then:
        weChatPayNotifyResult != null
    }
}
