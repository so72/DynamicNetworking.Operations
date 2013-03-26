
package dynamicNetworking.calculator.operations;
import dynamicNetworking.calculator.operationsServer.Operation;

/**
 *
 * @author steffen, mark
 */
public class Multiplication implements Operation
{
  @Override
  public float compute(float firstNumber, float secondNumber)
  {
    return firstNumber * secondNumber;
  } 
} 