/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.params;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

public interface CobolParserParams {

	/**
	 * @see https://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
	 */
	Charset getCharset();

	List<File> getCopyBookDirectories();

	List<String> getCopyBookExtensions();

	List<File> getCopyBookFiles();

	CobolDialect getDialect();

	CobolSourceFormatEnum getFormat();

	boolean getIgnoreSyntaxErrors();

	void setCharset(Charset charset);

	void setCopyBookDirectories(List<File> copyBookDirectories);

	void setCopyBookExtensions(List<String> copyBookExtensions);

	void setCopyBookFiles(List<File> copyBookFiles);

	void setDialect(CobolDialect dialect);

	void setFormat(CobolSourceFormatEnum format);

	void setIgnoreSyntaxErrors(boolean ignoreSyntaxErrors);
}
