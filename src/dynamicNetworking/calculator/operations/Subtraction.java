
package dynamicNetworking.calculator.operations;
import dynamicNetworking.calculator.operationsServer.Operation;

/**
 *
 * @author steffen, mark
 */
public class Subtraction implements Operation
{
  @Override
  public float compute(float firstNumber, float secondNumber)
  {
    return firstNumber - secondNumber;
  } 
} 