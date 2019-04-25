package pl.edu.agh.agentsystem.event;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import pl.edu.agh.agentsystem.utils.ChemicalElement;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class ProductParameters extends Event {
  public final float totalWeight;
  
  public final int refinementLevel;
  
  public final Map<ChemicalElement, Float> compositionOfTheProduct;
  
  public final float maxPollution;
  
  public ProductParameters(final float totalWeight, final int refinementLevel, final Map<ChemicalElement, Float> compositionOfTheProduct, final float maxPollution) {
    this.totalWeight = totalWeight;
    this.refinementLevel = refinementLevel;
    this.compositionOfTheProduct = compositionOfTheProduct;
    this.maxPollution = maxPollution;
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
    ProductParameters other = (ProductParameters) obj;
    if (Float.floatToIntBits(other.totalWeight) != Float.floatToIntBits(this.totalWeight))
      return false;
    if (other.refinementLevel != this.refinementLevel)
      return false;
    if (Float.floatToIntBits(other.maxPollution) != Float.floatToIntBits(this.maxPollution))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.totalWeight);
    result = prime * result + this.refinementLevel;
    result = prime * result + Float.floatToIntBits(this.maxPollution);
    return result;
  }
  
  /**
   * Returns a String representation of the ProductParameters event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("totalWeight", this.totalWeight);
    builder.add("refinementLevel", this.refinementLevel);
    builder.add("compositionOfTheProduct", this.compositionOfTheProduct);
    builder.add("maxPollution", this.maxPollution);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -1024153181L;
}
