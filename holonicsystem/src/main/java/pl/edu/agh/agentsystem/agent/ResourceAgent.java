package pl.edu.agh.agentsystem.agent;

import pl.edu.agh.agentsystem.agent.operationholon.CoolingMachineAgent;
import pl.edu.agh.agentsystem.agent.operationholon.FurnanceAgent;
import pl.edu.agh.agentsystem.agent.operationholon.OperationAgent;

public class ResourceAgent {
	
	public ResourceAgent() {
	}
	
	public CoolingMachineAgent getCoolingMachineAgent() {
		return new CoolingMachineAgent();
	}
	
	public FurnanceAgent getFurnanceAgent() {
		return new FurnanceAgent();
	}
	
}
