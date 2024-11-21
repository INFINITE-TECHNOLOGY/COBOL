package io.proleap.cobol.asg.procedure.stop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import io.proleap.cobol.CobolTestBase;
import io.proleap.cobol.asg.metamodel.CompilationUnit;
import io.proleap.cobol.asg.metamodel.Literal;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.procedure.ProcedureDivision;
import io.proleap.cobol.asg.metamodel.procedure.StatementTypeEnum;
import io.proleap.cobol.asg.metamodel.procedure.stop.StopStatement;
import io.proleap.cobol.asg.metamodel.procedure.stop.StopStatement.StopType;
import io.proleap.cobol.asg.metamodel.valuestmt.LiteralValueStmt;
import io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl;
import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

public class StopStatementTest extends CobolTestBase {

	@Test
	public void test() throws Exception {
		final File inputFile = new File("src/test/resources/io/proleap/cobol/asg/procedure/stop/StopStatement.cbl");
		final Program program = new CobolParserRunnerImpl().analyzeFile(inputFile, CobolSourceFormatEnum.TANDEM);

		final CompilationUnit compilationUnit = program.getCompilationUnit("StopStatement");
		final ProgramUnit programUnit = compilationUnit.getProgramUnit();
		final ProcedureDivision procedureDivision = programUnit.getProcedureDivision();
		assertEquals(0, procedureDivision.getParagraphs().size());
		assertEquals(2, procedureDivision.getStatements().size());

		{
			final StopStatement stopStatement = (StopStatement) procedureDivision.getStatements().get(0);
			assertNotNull(stopStatement);
			assertEquals(StatementTypeEnum.STOP, stopStatement.getStatementType());
			assertEquals(StopType.STOP_RUN, stopStatement.getStopType());
		}

		{
			final StopStatement stopStatement = (StopStatement) procedureDivision.getStatements().get(1);
			assertNotNull(stopStatement);
			assertEquals(StatementTypeEnum.STOP, stopStatement.getStatementType());
			assertEquals(StopType.STOP_RUN_AND_DISPLAY, stopStatement.getStopType());
			assertNotNull(stopStatement.getDisplayValueStmt());

			final LiteralValueStmt displayValueStmt = (LiteralValueStmt) stopStatement.getDisplayValueStmt();
			final Literal literal = displayValueStmt.getLiteral();
			assertEquals("someliteral", literal.getValue());
		}
	}
}