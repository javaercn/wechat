package cn.javaer.wechat.sdk.pay.model;

import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link WeChatPayUnifiedOrderRequest} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractWeChatPayUnifiedOrderRequestAssert<S extends AbstractWeChatPayUnifiedOrderRequestAssert<S, A>, A extends WeChatPayUnifiedOrderRequest> extends AbstractWeChatPayRequestAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWeChatPayUnifiedOrderRequestAssert}</code> to make assertions on actual WeChatPayUnifiedOrderRequest.
   * @param actual the WeChatPayUnifiedOrderRequest we want to make assertions on.
   */
  protected AbstractWeChatPayUnifiedOrderRequestAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's attach is equal to the given one.
   * @param attach the given attach to compare the actual WeChatPayUnifiedOrderRequest's attach to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's attach is not equal to the given one.
   */
  public S hasAttach(String attach) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting attach of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualAttach = actual.getAttach();
    if (!Objects.areEqual(actualAttach, attach)) {
      failWithMessage(assertjErrorMessage, actual, attach, actualAttach);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's body is equal to the given one.
   * @param body the given body to compare the actual WeChatPayUnifiedOrderRequest's body to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's body is not equal to the given one.
   */
  public S hasBody(String body) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting body of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualBody = actual.getBody();
    if (!Objects.areEqual(actualBody, body)) {
      failWithMessage(assertjErrorMessage, actual, body, actualBody);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's detail is equal to the given one.
   * @param detail the given detail to compare the actual WeChatPayUnifiedOrderRequest's detail to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's detail is not equal to the given one.
   */
  public S hasDetail(String detail) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting detail of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDetail = actual.getDetail();
    if (!Objects.areEqual(actualDetail, detail)) {
      failWithMessage(assertjErrorMessage, actual, detail, actualDetail);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's deviceInfo is equal to the given one.
   * @param deviceInfo the given deviceInfo to compare the actual WeChatPayUnifiedOrderRequest's deviceInfo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's deviceInfo is not equal to the given one.
   */
  public S hasDeviceInfo(String deviceInfo) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deviceInfo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDeviceInfo = actual.getDeviceInfo();
    if (!Objects.areEqual(actualDeviceInfo, deviceInfo)) {
      failWithMessage(assertjErrorMessage, actual, deviceInfo, actualDeviceInfo);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's feeType is equal to the given one.
   * @param feeType the given feeType to compare the actual WeChatPayUnifiedOrderRequest's feeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's feeType is not equal to the given one.
   */
  public S hasFeeType(String feeType) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting feeType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualFeeType = actual.getFeeType();
    if (!Objects.areEqual(actualFeeType, feeType)) {
      failWithMessage(assertjErrorMessage, actual, feeType, actualFeeType);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's goodsTag is equal to the given one.
   * @param goodsTag the given goodsTag to compare the actual WeChatPayUnifiedOrderRequest's goodsTag to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's goodsTag is not equal to the given one.
   */
  public S hasGoodsTag(String goodsTag) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting goodsTag of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualGoodsTag = actual.getGoodsTag();
    if (!Objects.areEqual(actualGoodsTag, goodsTag)) {
      failWithMessage(assertjErrorMessage, actual, goodsTag, actualGoodsTag);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's limitPay is equal to the given one.
   * @param limitPay the given limitPay to compare the actual WeChatPayUnifiedOrderRequest's limitPay to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's limitPay is not equal to the given one.
   */
  public S hasLimitPay(String limitPay) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting limitPay of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLimitPay = actual.getLimitPay();
    if (!Objects.areEqual(actualLimitPay, limitPay)) {
      failWithMessage(assertjErrorMessage, actual, limitPay, actualLimitPay);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's notifyUrl is equal to the given one.
   * @param notifyUrl the given notifyUrl to compare the actual WeChatPayUnifiedOrderRequest's notifyUrl to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's notifyUrl is not equal to the given one.
   */
  public S hasNotifyUrl(String notifyUrl) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting notifyUrl of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualNotifyUrl = actual.getNotifyUrl();
    if (!Objects.areEqual(actualNotifyUrl, notifyUrl)) {
      failWithMessage(assertjErrorMessage, actual, notifyUrl, actualNotifyUrl);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's openid is equal to the given one.
   * @param openid the given openid to compare the actual WeChatPayUnifiedOrderRequest's openid to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's openid is not equal to the given one.
   */
  public S hasOpenid(String openid) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting openid of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualOpenid = actual.getOpenid();
    if (!Objects.areEqual(actualOpenid, openid)) {
      failWithMessage(assertjErrorMessage, actual, openid, actualOpenid);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's outTradeNo is equal to the given one.
   * @param outTradeNo the given outTradeNo to compare the actual WeChatPayUnifiedOrderRequest's outTradeNo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's outTradeNo is not equal to the given one.
   */
  public S hasOutTradeNo(String outTradeNo) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting outTradeNo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualOutTradeNo = actual.getOutTradeNo();
    if (!Objects.areEqual(actualOutTradeNo, outTradeNo)) {
      failWithMessage(assertjErrorMessage, actual, outTradeNo, actualOutTradeNo);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's productId is equal to the given one.
   * @param productId the given productId to compare the actual WeChatPayUnifiedOrderRequest's productId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's productId is not equal to the given one.
   */
  public S hasProductId(String productId) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting productId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualProductId = actual.getProductId();
    if (!Objects.areEqual(actualProductId, productId)) {
      failWithMessage(assertjErrorMessage, actual, productId, actualProductId);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's sceneInfo is equal to the given one.
   * @param sceneInfo the given sceneInfo to compare the actual WeChatPayUnifiedOrderRequest's sceneInfo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's sceneInfo is not equal to the given one.
   */
  public S hasSceneInfo(String sceneInfo) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting sceneInfo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualSceneInfo = actual.getSceneInfo();
    if (!Objects.areEqual(actualSceneInfo, sceneInfo)) {
      failWithMessage(assertjErrorMessage, actual, sceneInfo, actualSceneInfo);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's spbillCreateIp is equal to the given one.
   * @param spbillCreateIp the given spbillCreateIp to compare the actual WeChatPayUnifiedOrderRequest's spbillCreateIp to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's spbillCreateIp is not equal to the given one.
   */
  public S hasSpbillCreateIp(String spbillCreateIp) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting spbillCreateIp of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualSpbillCreateIp = actual.getSpbillCreateIp();
    if (!Objects.areEqual(actualSpbillCreateIp, spbillCreateIp)) {
      failWithMessage(assertjErrorMessage, actual, spbillCreateIp, actualSpbillCreateIp);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's timeExpire is equal to the given one.
   * @param timeExpire the given timeExpire to compare the actual WeChatPayUnifiedOrderRequest's timeExpire to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's timeExpire is not equal to the given one.
   */
  public S hasTimeExpire(String timeExpire) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting timeExpire of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTimeExpire = actual.getTimeExpire();
    if (!Objects.areEqual(actualTimeExpire, timeExpire)) {
      failWithMessage(assertjErrorMessage, actual, timeExpire, actualTimeExpire);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's timeStart is equal to the given one.
   * @param timeStart the given timeStart to compare the actual WeChatPayUnifiedOrderRequest's timeStart to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's timeStart is not equal to the given one.
   */
  public S hasTimeStart(String timeStart) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting timeStart of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTimeStart = actual.getTimeStart();
    if (!Objects.areEqual(actualTimeStart, timeStart)) {
      failWithMessage(assertjErrorMessage, actual, timeStart, actualTimeStart);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's totalFee is equal to the given one.
   * @param totalFee the given totalFee to compare the actual WeChatPayUnifiedOrderRequest's totalFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's totalFee is not equal to the given one.
   */
  public S hasTotalFee(Integer totalFee) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting totalFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualTotalFee = actual.getTotalFee();
    if (!Objects.areEqual(actualTotalFee, totalFee)) {
      failWithMessage(assertjErrorMessage, actual, totalFee, actualTotalFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayUnifiedOrderRequest's tradeType is equal to the given one.
   * @param tradeType the given tradeType to compare the actual WeChatPayUnifiedOrderRequest's tradeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayUnifiedOrderRequest's tradeType is not equal to the given one.
   */
  public S hasTradeType(String tradeType) {
    // check that actual WeChatPayUnifiedOrderRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tradeType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTradeType = actual.getTradeType();
    if (!Objects.areEqual(actualTradeType, tradeType)) {
      failWithMessage(assertjErrorMessage, actual, tradeType, actualTradeType);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
