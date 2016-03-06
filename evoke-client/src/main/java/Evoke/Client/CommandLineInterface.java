package Evoke.Client;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Created by lambeaux on 2/22/16.
 *
 */
public class CommandLineInterface {
    private String[] args = null;
    private Options options = new Options();

    public CommandLineInterface(String[] args) {
        this.args = args;
        options.addOption("h", "help", false, "Show help.");
        options.addOption("v", "var", true, "Here you can set a parameter. ");
    }

    public void parse() {
        CommandLineParser parser = new BasicParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
            if (cmd.hasOption("h")) {
                //help
            }
            if (cmd.hasOption("v")) {
                //do stuff
            } else {
                //help
            }
        } catch (ParseException e) {
            //failed
            //help
        }
    }

    private void help() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("Main", options);
        System.exit(0);
    }
}
