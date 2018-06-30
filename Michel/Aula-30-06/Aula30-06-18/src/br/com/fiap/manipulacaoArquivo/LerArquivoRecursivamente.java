package br.com.fiap.manipulacaoArquivo;

import java.io.IOException; 
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class LerArquivoRecursivamente extends SimpleFileVisitor<Path> {
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");
	private Path destino;
	
	public LerArquivoRecursivamente(Path destino) {
		this.destino = destino;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		try {
			if (matcher.matches(file.getFileName())) {  
				Files.copy(file,destino.resolve(file.getFileName()),StandardCopyOption.REPLACE_EXISTING);
				System.out.println("lendo o arquivo " + file.getFileName()); 
			} 
		} finally {
			return FileVisitResult.CONTINUE;	
		}
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("Falhou ");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Lendo diretório... " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	 
}