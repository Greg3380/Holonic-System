package pl.edu.agh.agentsystem.event;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import pl.edu.agh.agentsystem.event.ExchangeParameters;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class CoolWithOil extends Event {
  public final ExchangeParameters exchangeParameters;
  
  public CoolWithOil(final ExchangeParameters exchangeParameters) {
    this.exchangeParameters = exchangeParameters;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  /**
   * Returns a String representation of the CoolWithOil event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("exchangeParameters", this.exchangeParameters);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -728051406L;
}
