<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/hello-world">
        <html>
            <body>
                <h1><xsl:value-of select="greeting"/></h1>
                <xsl:apply-templates select="greeter"/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="greeter">
        <div>from <i><xsl:value-of select="."/></i></div>
    </xsl:template>
</xsl:stylesheet>