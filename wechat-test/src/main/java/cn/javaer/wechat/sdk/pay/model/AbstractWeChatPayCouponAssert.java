package cn.javaer.wechat.sdk.pay.model;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link WeChatPayCoupon} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractWeChatPayCouponAssert<S extends AbstractWeChatPayCouponAssert<S, A>, A extends WeChatPayCoupon> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWeChatPayCouponAssert}</code> to make assertions on actual WeChatPayCoupon.
   * @param actual the WeChatPayCoupon we want to make assertions on.
   */
  protected AbstractWeChatPayCouponAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WeChatPayCoupon's fee is equal to the given one.
   * @param fee the given fee to compare the actual WeChatPayCoupon's fee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayCoupon's fee is not equal to the given one.
   */
  public S hasFee(Integer fee) {
    // check that actual WeChatPayCoupon we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting fee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualFee = actual.getFee();
    if (!Objects.areEqual(actualFee, fee)) {
      failWithMessage(assertjErrorMessage, actual, fee, actualFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayCoupon's id is equal to the given one.
   * @param id the given id to compare the actual WeChatPayCoupon's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayCoupon's id is not equal to the given one.
   */
  public S hasId(String id) {
    // check that actual WeChatPayCoupon we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayCoupon's type is equal to the given one.
   * @param type the given type to compare the actual WeChatPayCoupon's type to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayCoupon's type is not equal to the given one.
   */
  public S hasType(WeChatPayCoupon.Type type) {
    // check that actual WeChatPayCoupon we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting type of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    WeChatPayCoupon.Type actualType = actual.getType();
    if (!Objects.areEqual(actualType, type)) {
      failWithMessage(assertjErrorMessage, actual, type, actualType);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
