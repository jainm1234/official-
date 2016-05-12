public interface RijndaelMethods {

	byte[][] RoundKey(byte[][] wordBox, byte[][] w, int round);

	byte[][] SubBytes(byte[][] words);

	byte[][] ShiftRows(byte[][] words);

	byte[][] MixColumns(byte[][] words);

}
