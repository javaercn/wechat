package cn.javaer.wechat.sdk.pay.model;

import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link WeChatPayRefundQueryResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractWeChatPayRefundQueryResponseAssert<S extends AbstractWeChatPayRefundQueryResponseAssert<S, A>, A extends WeChatPayRefundQueryResponse> extends AbstractWeChatPayResponseAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWeChatPayRefundQueryResponseAssert}</code> to make assertions on actual WeChatPayRefundQueryResponse.
   * @param actual the WeChatPayRefundQueryResponse we want to make assertions on.
   */
  protected AbstractWeChatPayRefundQueryResponseAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's cashFee is equal to the given one.
   * @param cashFee the given cashFee to compare the actual WeChatPayRefundQueryResponse's cashFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's cashFee is not equal to the given one.
   */
  public S hasCashFee(Integer cashFee) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting cashFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualCashFee = actual.getCashFee();
    if (!Objects.areEqual(actualCashFee, cashFee)) {
      failWithMessage(assertjErrorMessage, actual, cashFee, actualCashFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's feeType is equal to the given one.
   * @param feeType the given feeType to compare the actual WeChatPayRefundQueryResponse's feeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's feeType is not equal to the given one.
   */
  public S hasFeeType(String feeType) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
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
   * Verifies that the actual WeChatPayRefundQueryResponse's outTradeNo is equal to the given one.
   * @param outTradeNo the given outTradeNo to compare the actual WeChatPayRefundQueryResponse's outTradeNo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's outTradeNo is not equal to the given one.
   */
  public S hasOutTradeNo(String outTradeNo) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
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
   * Verifies that the actual WeChatPayRefundQueryResponse's refundCount is equal to the given one.
   * @param refundCount the given refundCount to compare the actual WeChatPayRefundQueryResponse's refundCount to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's refundCount is not equal to the given one.
   */
  public S hasRefundCount(Integer refundCount) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting refundCount of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualRefundCount = actual.getRefundCount();
    if (!Objects.areEqual(actualRefundCount, refundCount)) {
      failWithMessage(assertjErrorMessage, actual, refundCount, actualRefundCount);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's refundMap is equal to the given one.
   * @param refundMap the given refundMap to compare the actual WeChatPayRefundQueryResponse's refundMap to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's refundMap is not equal to the given one.
   */
  public S hasRefundMap(java.util.Map refundMap) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting refundMap of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Map actualRefundMap = actual.getRefundMap();
    if (!Objects.areEqual(actualRefundMap, refundMap)) {
      failWithMessage(assertjErrorMessage, actual, refundMap, actualRefundMap);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's settlementTotalFee is equal to the given one.
   * @param settlementTotalFee the given settlementTotalFee to compare the actual WeChatPayRefundQueryResponse's settlementTotalFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's settlementTotalFee is not equal to the given one.
   */
  public S hasSettlementTotalFee(Integer settlementTotalFee) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting settlementTotalFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualSettlementTotalFee = actual.getSettlementTotalFee();
    if (!Objects.areEqual(actualSettlementTotalFee, settlementTotalFee)) {
      failWithMessage(assertjErrorMessage, actual, settlementTotalFee, actualSettlementTotalFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's totalFee is equal to the given one.
   * @param totalFee the given totalFee to compare the actual WeChatPayRefundQueryResponse's totalFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's totalFee is not equal to the given one.
   */
  public S hasTotalFee(Integer totalFee) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
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
   * Verifies that the actual WeChatPayRefundQueryResponse's totalRefundCount is equal to the given one.
   * @param totalRefundCount the given totalRefundCount to compare the actual WeChatPayRefundQueryResponse's totalRefundCount to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's totalRefundCount is not equal to the given one.
   */
  public S hasTotalRefundCount(Integer totalRefundCount) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting totalRefundCount of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualTotalRefundCount = actual.getTotalRefundCount();
    if (!Objects.areEqual(actualTotalRefundCount, totalRefundCount)) {
      failWithMessage(assertjErrorMessage, actual, totalRefundCount, actualTotalRefundCount);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayRefundQueryResponse's transactionId is equal to the given one.
   * @param transactionId the given transactionId to compare the actual WeChatPayRefundQueryResponse's transactionId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayRefundQueryResponse's transactionId is not equal to the given one.
   */
  public S hasTransactionId(String transactionId) {
    // check that actual WeChatPayRefundQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting transactionId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTransactionId = actual.getTransactionId();
    if (!Objects.areEqual(actualTransactionId, transactionId)) {
      failWithMessage(assertjErrorMessage, actual, transactionId, actualTransactionId);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
