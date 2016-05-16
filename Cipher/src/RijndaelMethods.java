public interface RijndaelMethods {

	byte[][] roundKey(byte[][] wordBox, byte[][] w, int round);

	byte[][] SubBytes(byte[][] words);

	byte[][] ShiftRows(byte[][] words);

	byte[][] MixColumns(byte[][] words);

}
