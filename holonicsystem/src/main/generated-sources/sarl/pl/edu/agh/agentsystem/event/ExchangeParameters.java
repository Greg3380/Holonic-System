package pl.edu.agh.agentsystem.event;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import pl.edu.agh.agentsystem.event.ProductParameters;
import pl.edu.agh.agentsystem.utils.AgentType;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class ExchangeParameters extends Event {
  public final ProductParameters productParameters;
  
  public final float alloyStrength;
  
  public final float alloyExtensibility;
  
  public final int temperature;
  
  public final int time;
  
  public final AgentType nextAgent;
  
  public ExchangeParameters(final ProductParameters productParameters, final float alloyStrength, final float alloyExtensibility, final int temperature, final int time, final AgentType nextAgent) {
    this.productParameters = productParameters;
    this.alloyStrength = alloyStrength;
    this.alloyExtensibility = alloyExtensibility;
    this.temperature = temperature;
    this.time = time;
    this.nextAgent = nextAgent;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ExchangeParameters other = (ExchangeParameters) obj;
    if (Float.floatToIntBits(other.alloyStrength) != Float.floatToIntBits(this.alloyStrength))
      return false;
    if (Float.floatToIntBits(other.alloyExtensibility) != Float.floatToIntBits(this.alloyExtensibility))
      return false;
    if (other.temperature != this.temperature)
      return false;
    if (other.time != this.time)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.alloyStrength);
    result = prime * result + Float.floatToIntBits(this.alloyExtensibility);
    result = prime * result + this.temperature;
    result = prime * result + this.time;
    return result;
  }
  
  /**
   * Returns a String representation of the ExchangeParameters event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("productParameters", this.productParameters);
    builder.add("alloyStrength", this.alloyStrength);
    builder.add("alloyExtensibility", this.alloyExtensibility);
    builder.add("temperature", this.temperature);
    builder.add("time", this.time);
    builder.add("nextAgent", this.nextAgent);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 5040486905L;
}
