
package com.verisign.iot.discovery.cli.command;

import com.verisign.iot.discovery.cli.parser.Options;
import joptsimple.OptionSet;

import com.verisign.iot.discovery.cli.ConsoleWriter;
import com.verisign.iot.discovery.cli.exception.OptionsNotValidException;
import com.verisign.iot.discovery.exceptions.DnsServiceException;

/**
 * Created by nbrasey on 5/4/15.
 */
public class ShowHelpCommand extends DnsSdAbstractCommand {

	@Override
	public void initialize ( OptionSet optionSet ) throws OptionsNotValidException {
		super.initialize( optionSet );
	}


	@Override
	public void doExecute ( ConsoleWriter consoleWriter ) throws DnsServiceException {
		consoleWriter.log( Options.getUsage() );
	}

}
