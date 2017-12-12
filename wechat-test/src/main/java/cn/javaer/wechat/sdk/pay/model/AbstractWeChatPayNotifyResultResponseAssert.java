package cn.javaer.wechat.sdk.pay.model;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link WeChatPayNotifyResultResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractWeChatPayNotifyResultResponseAssert<S extends AbstractWeChatPayNotifyResultResponseAssert<S, A>, A extends WeChatPayNotifyResultResponse> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWeChatPayNotifyResultResponseAssert}</code> to make assertions on actual WeChatPayNotifyResultResponse.
   * @param actual the WeChatPayNotifyResultResponse we want to make assertions on.
   */
  protected AbstractWeChatPayNotifyResultResponseAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WeChatPayNotifyResultResponse's returnCode is equal to the given one.
   * @param returnCode the given returnCode to compare the actual WeChatPayNotifyResultResponse's returnCode to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayNotifyResultResponse's returnCode is not equal to the given one.
   */
  public S hasReturnCode(String returnCode) {
    // check that actual WeChatPayNotifyResultResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting returnCode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualReturnCode = actual.getReturnCode();
    if (!Objects.areEqual(actualReturnCode, returnCode)) {
      failWithMessage(assertjErrorMessage, actual, returnCode, actualReturnCode);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayNotifyResultResponse's returnMsg is equal to the given one.
   * @param returnMsg the given returnMsg to compare the actual WeChatPayNotifyResultResponse's returnMsg to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayNotifyResultResponse's returnMsg is not equal to the given one.
   */
  public S hasReturnMsg(String returnMsg) {
    // check that actual WeChatPayNotifyResultResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting returnMsg of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualReturnMsg = actual.getReturnMsg();
    if (!Objects.areEqual(actualReturnMsg, returnMsg)) {
      failWithMessage(assertjErrorMessage, actual, returnMsg, actualReturnMsg);
    }

    // return the current assertion for method chaining
    return myself;
  }

}