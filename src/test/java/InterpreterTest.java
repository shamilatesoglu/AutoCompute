// Copyright (c) 2021 M. Samil Atesoglu
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

import msa.lang.autocompute.AutoCompute;
import msa.lang.autocompute.ds.Pair;
import msa.lang.autocompute.utils.ExecutionTimer;
import msa.lang.autocompute.utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class InterpreterTest {
    @Test
    public void testParseTree() throws UnsupportedEncodingException {


        String source = FileUtils.readString("grammar/yks.ac");

        AutoCompute.executeAll(source);


    }

    @Test
    public void testSpeed() {
        String source = FileUtils.readString("grammar/yks.ac");

        int i = 30;
        while (i-- > 0) {
            long t =
                    new ExecutionTimer() {
                        @Override
                        public void execute() {
                            try {
                                compute(source);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                        }
                    }.start();
            System.out.printf("Time: %f%n", t / 1000.0);
        }
    }

    private void compute(String source) throws UnsupportedEncodingException {
        source += "compute yks {\n" +
                "   tyt::turkce::dogru       << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::turkce::yanlis      << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::matematik::dogru    << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::matematik::yanlis   << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::sosyal::dogru       << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::sosyal::yanlis      << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::fen::dogru          << " + ((int) (Math.random() * 20)) + ".\n" +
                "   tyt::fen::yanlis         << " + ((int) (Math.random() * 20)) + ".\n" +
                "   diploma_notu             << " + ((int) (50 + Math.random() * 50)) + ".\n" +
                "}.\n";

        execute(source);
    }

    private void execute(String source) throws UnsupportedEncodingException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        AutoCompute.executeAll(source, new PrintStream(outputStream, true, "UTF-8"));
        String result = outputStream.toString("utf-8");

        List<Pair<String, Object>> results = new ArrayList<>();
        String[] lines = result.split(System.lineSeparator());
        for (String line : lines) {
            String[] arr = line.split(" = ");
            String reference = arr[0];
            String value = arr[1];
            value = value.substring(0, value.length() - 1);
            if (value.startsWith("NaN")) {
                value = value.split(", ")[1];
                value = value.substring(1, value.length() - 1);
                results.add(new Pair<>(reference, value));
            } else {
                Double n = Double.parseDouble(value);
                results.add(new Pair<>(reference, n));
            }
        }
    }
}
