package pl.edu.agh.agentsystem.capacity;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;
import pl.edu.agh.agentsystem.event.ExchangeParameters;

@SarlSpecification("0.8")
@SarlElementType(19)
@SuppressWarnings("all")
public interface Cooling extends Capacity {
  public abstract ExchangeParameters coolWithAir(final ExchangeParameters exchangeParameters);
  
  public abstract ExchangeParameters coolWithWater(final ExchangeParameters exchangeParameters);
  
  public abstract ExchangeParameters coolWithOil(final ExchangeParameters exchangeParameters);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends Cooling> extends Capacity.ContextAwareCapacityWrapper<C> implements Cooling {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public ExchangeParameters coolWithAir(final ExchangeParameters exchangeParameters) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.coolWithAir(exchangeParameters);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public ExchangeParameters coolWithWater(final ExchangeParameters exchangeParameters) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.coolWithWater(exchangeParameters);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public ExchangeParameters coolWithOil(final ExchangeParameters exchangeParameters) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.coolWithOil(exchangeParameters);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
