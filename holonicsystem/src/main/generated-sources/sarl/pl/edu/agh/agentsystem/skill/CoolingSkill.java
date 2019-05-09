package pl.edu.agh.agentsystem.skill;

import io.sarl.core.Logging;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;
import pl.edu.agh.agentsystem.capacity.Cooling;
import pl.edu.agh.agentsystem.event.ExchangeParameters;
import pl.edu.agh.agentsystem.utils.AgentType;
import pl.edu.agh.agentsystem.utils.ChemicalElement;

@SarlSpecification("0.8")
@SarlElementType(21)
@SuppressWarnings("all")
public class CoolingSkill extends Skill implements Cooling {
  public void install() {
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER.info("Installing the skill");
  }
  
  public void uninstall() {
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER.info("Uninstalling the skill");
  }
  
  public ExchangeParameters coolWithAir(final ExchangeParameters exchangeParameters) {
    float alloyStrength = ((1 - exchangeParameters.productParameters.maxPollution) * 500);
    Float _get = exchangeParameters.productParameters.compositionOfTheProduct.get(ChemicalElement.COPPER);
    float alloyExtensibility = (((_get).floatValue() * 3f) * 100);
    int temperature = 20;
    int time = (exchangeParameters.time + 3);
    AgentType nextAgent = exchangeParameters.nextAgent;
    return new ExchangeParameters(exchangeParameters.productParameters, alloyStrength, alloyExtensibility, temperature, time, nextAgent);
  }
  
  public ExchangeParameters coolWithWater(final ExchangeParameters exchangeParameters) {
    float alloyStrength = ((1 - exchangeParameters.productParameters.maxPollution) * 500);
    Float _get = exchangeParameters.productParameters.compositionOfTheProduct.get(
      ChemicalElement.COPPER);
    float alloyExtensibility = ((((_get).floatValue() * 3f) * 100) * 1.1f);
    int temperature = 20;
    int time = (exchangeParameters.time + 2);
    AgentType nextAgent = exchangeParameters.nextAgent;
    return new ExchangeParameters(exchangeParameters.productParameters, alloyStrength, alloyExtensibility, temperature, time, nextAgent);
  }
  
  public ExchangeParameters coolWithOil(final ExchangeParameters exchangeParameters) {
    float alloyStrength = ((1 - exchangeParameters.productParameters.maxPollution) * 500);
    Float _get = exchangeParameters.productParameters.compositionOfTheProduct.get(
      ChemicalElement.COPPER);
    float alloyExtensibility = ((((_get).floatValue() * 3f) * 100) * 1.15f);
    int temperature = 20;
    int time = (exchangeParameters.time + 1);
    AgentType nextAgent = exchangeParameters.nextAgent;
    return new ExchangeParameters(exchangeParameters.productParameters, alloyStrength, alloyExtensibility, temperature, time, nextAgent);
  }
  
  @Extension
  @ImportedCapacityFeature(Logging.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_LOGGING;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Logging.class, ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || $0$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING = $0$getSkill(Logging.class)) : $0$CAPACITY_USE$IO_SARL_CORE_LOGGING)", imported = Logging.class)
  private Logging $CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = $getSkill(Logging.class);
    }
    return $castSkill(Logging.class, this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
  }
  
  @SyntheticMember
  public CoolingSkill() {
    super();
  }
  
  @SyntheticMember
  public CoolingSkill(final Agent agent) {
    super(agent);
  }
}
