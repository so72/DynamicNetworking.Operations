
package dynamicNetworking.calculator.operations;
import dynamicNetworking.calculator.operationsServer.Operation;

/**
 *
 * @author steffen, mark
 */
public class Subtraction implements Operation
{
  @Override
  public float compute(float op1, float op2)
  {
    return op1 - op2;
  } 
} 